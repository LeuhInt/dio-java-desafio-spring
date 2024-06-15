//package dio.spring.project;
//
//import dio.spring.project.model.Autor;
//import dio.spring.project.repository.AutorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MyApp implements CommandLineRunner {
//
//    @Autowired
//    private AutorRepository autorRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Autor autor = new Autor();
//        autor.setName("Leuh");
//        autor.setNacionalidade("BR");
//        autorRepository.save(autor);
//
//        Autor autor2 = new Autor();
//        autor2.setName("Mary");
//        autor2.setNacionalidade("AL");
//        autorRepository.save(autor2);
//
//        Autor autor3 = new Autor();
//        autor3.setName("Jack");
//        autor3.setNacionalidade("BL");
//        autorRepository.save(autor3);
//
//        for (Autor a : autorRepository.findAll()) {
//            System.out.println(a);
//        }
//
//
//    }
//}
