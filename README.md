# exampleSpringMVCWebForm

### **1. Description**
* **MySQL**을 이용한 Spring MVC Web Form 예제 프로그램입니다.
* **Data Binding** : 사용자의 입력 값을 객체에 바인딩
* **Data Validation** : 올바른 값이 입력되었는지 검증
* **Data Buffering** : View에 값을 채움(Spring Form Taglib)


### **2. Environment**
* **Eclispe**
  + Spring Legacy Project
    - Template : Spring MVC 선택
* **Server**
  + Tomcat
* **Database**
  + MySQL
  
  
### **3. Packages**
* **controller**
  + 사용자의 요청(request)을 처리하는 Class
  + Service Class의 객체를 사용하여 필요한 작업을 수행
  + **HomeController, OfferController**
* **dao**
  + DAO Class를 위한 패키지
  + DB에 접근하여 수행할 작업을 메서드로 구현
  + **OfferDao**
* **model**
  + 애플리케이션에서 사용할 Model Class를 위한 패키지
  + Annotation을 통해 Data Validation을 위한 제약 조건 설정
  + **Offer**
* **service**
  + Service Layer를 구현하는 Class
  + DAO Class의 객체를 사용하여 필요한 작업을 수행
  + **OfferService**


### **4. Files**
* **pom.xml**
  + 기본적인 Spring Legacy Project의 POM에 추가된 Dependency들
    - lombok
    - hibernate-validator
    - spring-jdbc
    - mysql-connector-java
    - commons-dbcp2
* **web.xml**
  + contextConfigLocation 설정(dao-context.xml, service-context.xml)
  + DispatcherServlet 설정(servlet-context.xml)
* **jdbc.properties**
  + Database를 접근하기 위한 Property 정보
  + username과 password에는 본인의 MySQL 정보 입력
  + webapp/WEB-INF/**props**
* **dao-context.xml**
  + DataSource와 관련된 설정 수행
  + DAO 패키지를 스캔
  + webapp/WEB-INF/**spring/appServlet**
* **service-context.xml**
  + Service 패키지를 스캔
  + webapp/WEB-INF/**spring/appServlet**
* **servlet-context.xml**
  + DispatcherServlet에 의해 로드
  + Controller 패키지를 스캔
  + webapp/WEB-INF/**spring/appServlet**
* **home.jsp**
  + 사용자에게 보여지는 초기 화면
  + webapp/WEB-INF/**views**
* **offers.jsp**
  + DB로부터 Offer 정보를 가져와 출력하는 화면(**JSTL** 사용)
  + webapp/WEB-INF/**views**
* **createoffer.jsp**
  + **Form을 사용**해 새로운 offer 객체 정보를 사용자로부터 입력받음
  + **submit 버튼**을 통해 offer 객체 생성
  + webapp/WEB-INF/**views**
* **offercreated.jsp**
  + createoffer에서 새로 생성된 offer를 확인
  + webapp/WEB-INF/**views**
* **main.css**
  + createoffer.jsp에 적용되는 css 스타일
  + webapp/resources/**css**
* **offer.sql**
  + 예제 프로그램을 위한 MySQL Table Schema & Data 파일
