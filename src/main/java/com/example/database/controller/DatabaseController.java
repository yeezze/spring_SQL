package com.example.database.controller;

import com.example.database.domain.company.CustomerEntity;
import com.example.database.domain.university.*;
import com.example.database.service.company.*;
import com.example.database.service.university.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class DatabaseController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    StudentService studentService;

    @Autowired
    ProfessorService professorService;

    @Autowired
    CourseService courseService;

    @Autowired
    EnrollService enrollService;

    @Autowired
    LectureService lectureService;

    @Autowired
    WarehouseService warehouseService;

    @Autowired
    StocksService stocksService;

    @Autowired
    AuthorService authorService;

    @Autowired
    WrittenByService writtenByService;

    @Autowired
    PublisherService publisherService;

    @Autowired
    PublishedByService publishedByService;

    @Autowired
    BookService bookService;

    @Autowired
    ContainsService containsService;

    @Autowired
    ShoppingBasketService shoppingBasketService;

    @Autowired
    BasketOfService basketOfService;

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/home")
    public String home() {
        return "hello world";
    }

    @GetMapping(value = "/test")
    public ModelAndView ViewTest() {
        ModelAndView modelAndView = new ModelAndView("test");

        modelAndView.addObject("name", "world");

        return  modelAndView;
    }

    @GetMapping(value = "/emp")
    public ModelAndView emp() {
        ModelAndView modelAndView = new ModelAndView("emp");

        List<EmployeeEntity> employees = employeeService.findAll();

        modelAndView.addObject("employees", employees);

        return modelAndView;
    }

    @GetMapping(value = "/student")
    public ModelAndView stu() {
        ModelAndView modelAndView = new ModelAndView("selectTest");

        List<StudentEntity> students = studentService.findAll();

        modelAndView.addObject("students", students);

        return modelAndView;
    }

    @GetMapping(value = "/student/form")
    public ModelAndView FormStudent() {
        ModelAndView modelAndView = new ModelAndView("insertTestForm");
        return modelAndView;
    }

    @PostMapping(value = "/student")
    public ModelAndView InsertStudent(StudentEntity studentEntity) {
        ModelAndView modelAndView = new ModelAndView("insertTest");

        StudentEntity savedStudentEntity = studentService.save(studentEntity);

        modelAndView.addObject("student", savedStudentEntity);

        return  modelAndView;
    }

    // 1-a
    int countstu=0;
    int countpro=0;
    int countcou=0;
    int counten=0;
    int countlec=0;
    @GetMapping(value = "/1-a")
    public ModelAndView one_a() {
        ModelAndView modelAndView = new ModelAndView("1_a");

        // Data 확인
        List<StudentEntity> students = studentService.findAll();
        modelAndView.addObject("students", students);

        List<ProfessorEntity> professors = professorService.findAll();
        modelAndView.addObject("professors", professors);

        List<CourseEntity> courses = courseService.findAll();
        modelAndView.addObject("courses", courses);

        List<EnrollEntity> enrolls = enrollService.findAll();
        modelAndView.addObject("enrolls", enrolls);

        List<LectureEntity> lectures = lectureService.findAll();
        modelAndView.addObject("lectures", lectures);

        // tuple 총 갯수 출력
        countstu = studentService.countAll();
        modelAndView.addObject("countstu", countstu);

        countpro = professorService.countAll();
        modelAndView.addObject("countpro", countpro);

        countcou = courseService.countAll();
        modelAndView.addObject("countcou", countcou);

        counten = enrollService.countAll();
        modelAndView.addObject("counten", counten);

        countlec = lectureService.countAll();
        modelAndView.addObject("countlec", countlec);

        return modelAndView;
    }

    // 1-b 특정 학생 선택
    @GetMapping(value = "/1_b(1)")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("1_b(1)");

        return modelAndView;
    }
    // 1-b 검색
    @GetMapping(value = "/1_b(2)")
    public ModelAndView test12(@RequestParam(required = false) String id) {
        ModelAndView modelAndView = new ModelAndView("1_b(2)");

        List<Object[]> courses = courseService.findByIdwithenroll(id);
        modelAndView.addObject("courses", courses);
        return modelAndView;
    }

    // 1-d
    @GetMapping(value = "/1_d")
    public ModelAndView max() {
        ModelAndView modelAndView = new ModelAndView("1_d");

        List<Object[]> maxCourses = studentService.maxCourse();
        modelAndView.addObject("maxCourses", maxCourses);

        List<Object[]> minCourses = studentService.minCourse();
        modelAndView.addObject("minCourses", minCourses);
        return modelAndView;
    }

    // 1-h
    @GetMapping(value = "/1_h")
    public ModelAndView one_h() {
        ModelAndView modelAndView = new ModelAndView("1_h");

        List<Object[]> dept = studentService.count_1b_dept();
        modelAndView.addObject("dept_stu", dept);

        List<Object[]> year = studentService.count_1b_year();
        modelAndView.addObject("year_stu", year);

        return modelAndView;
    }

    // 1-g
    @GetMapping(value = "/1_g")
    public ModelAndView one_g() {
        ModelAndView modelAndView = new ModelAndView("1_g");

        List<Object[]> countLec = lectureService.countLec();
        modelAndView.addObject("countLecs", countLec);

        return modelAndView;
    }

    // 1-f
    @GetMapping(value = "/1_f")
    public ModelAndView one_f() {
        ModelAndView modelAndView = new ModelAndView("1_f");

        List<Object[]> avgcourses = enrollService.avgCourse();
        modelAndView.addObject("avgcourses", avgcourses);

        List<Object[]> gradestus = enrollService.gradeStu();
        modelAndView.addObject("gradestus", gradestus);

        return modelAndView;
    }

    // 1-e
    @GetMapping(value = "/1_e")
    public ModelAndView one_e() {
        ModelAndView modelAndView = new ModelAndView("1_e");

        List<Object[]> examStu = courseService.examStu();
        modelAndView.addObject("examStus", examStu);

        return modelAndView;
    }

    // 2-a 작가 이름 선택
    @GetMapping(value = "/2_a(1)")
    public ModelAndView two_a() {
        ModelAndView modelAndView = new ModelAndView("2_a");

        return modelAndView;
    }

    // 2-a 결과 조회
    @GetMapping(value = "/2_a(2)")
    public ModelAndView two_a2(String name) {
        ModelAndView modelAndView = new ModelAndView("2_a(2)");

        List<Object[]> stocks = stocksService.findStocksBywritten(name);
        modelAndView.addObject("stocks", stocks);

        return modelAndView;
    }

    // 2-c 모든 고객 정보 확인
    @GetMapping(value = "/2c")
    public ModelAndView two() {
        ModelAndView modelAndView = new ModelAndView("2c_all");

        List<CustomerEntity> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);

        return modelAndView;
    }

    // 2-c 특정 고객 검색
    @GetMapping(value = "/2_c(1)")
    public ModelAndView two_2c() {
        ModelAndView modelAndView = new ModelAndView("2_c_find");

        return modelAndView;
    }

    // 2-c 특정 고객 정보 출력
    @GetMapping(value = "/2_c(2)")
    public ModelAndView two_2c(@RequestParam(required = false) String email) {
        ModelAndView modelAndView = new ModelAndView("2_c");

        List<Object[]> lists = writtenByService.findcusinfo(email);
        modelAndView.addObject("lists", lists);

        return modelAndView;
    }

//    // 2-d
//    @GetMapping(value = "/2_d_form")
//    public ModelAndView FormStudent() {
//        ModelAndView modelAndView = new ModelAndView("2_d");
//        return modelAndView;
//    }
//
//    @PostMapping(value = "/2_d(2)")
//    public ModelAndView InsertStudent(StudentEntity studentEntity) {
//        ModelAndView modelAndView = new ModelAndView("2_d(3)");
//
//        StudentEntity savedStudentEntity = studentService.save(studentEntity);
//
//        modelAndView.addObject("student", savedStudentEntity);
//
//        return  modelAndView;
//    }

    // 2-e
    int avgPrice=0;
    @GetMapping(value = "/2_e")
    public ModelAndView two_e() {
        ModelAndView modelAndView = new ModelAndView("2_e");

        avgPrice = bookService.avgPrice();
        List<Object[]> avgPriceByYear = bookService.avgPriceByYear();
        modelAndView.addObject("avgPrice", avgPrice);
        modelAndView.addObject("avgPriceByYear", avgPriceByYear);

        return modelAndView;
    }

    // 2-f
    @GetMapping(value = "/2_f")
    public ModelAndView two_f() {
        ModelAndView modelAndView = new ModelAndView("2_f");

        List<Object[]> lists = writtenByService.findbookinfo();
        modelAndView.addObject("lists", lists);

        return modelAndView;
    }

    // 2-g 재고 입력하여 도서 조회
    @GetMapping(value = "/2_g")
    public ModelAndView two_g(String stock) {
        ModelAndView modelAndView = new ModelAndView("2_g");

        List<Object[]> lists = bookService.findBook(stock);
        modelAndView.addObject("lists", lists);

        return modelAndView;
    }

//    // 2-g 할인 가격 입력
//    @GetMapping(value = "2_g")
//    public ModelAndView formupdate() {
//        ModelAndView modelAndView = new ModelAndView("2_g");
//
//        return modelAndView;
//    }
    // 2-g 가격 할인
    @PostMapping(value = "/2_g")
    public ModelAndView two_g(int price, String num) {
        ModelAndView modelAndView = new ModelAndView("2g_update");

        modelAndView.addObject("price", price);
        modelAndView.addObject("num", num);
        bookService.updateBook(price, num);
        return modelAndView;
    }


}
