@RestController
@RequestMapping(value-"/api")
public Class Controller {

@GetMapping(value-"/hello")
public String hello() {
    return "Hello";
}

}