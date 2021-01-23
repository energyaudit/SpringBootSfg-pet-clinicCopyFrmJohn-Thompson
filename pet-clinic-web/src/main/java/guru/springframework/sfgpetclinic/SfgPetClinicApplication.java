package guru.springframework.sfgpetclinic;
/**
 * Added Project Lombok to project, closes #51
 * @springframeworkguru
 * springframeworkguru committed on Aug 24, 2018
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }
}
