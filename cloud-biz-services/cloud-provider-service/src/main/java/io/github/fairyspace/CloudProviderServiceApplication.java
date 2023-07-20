package io.github.fairyspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: cloud-one-framework
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/7/20
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderServiceApplication.class, args);
    }

}
