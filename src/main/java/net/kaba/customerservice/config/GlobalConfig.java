package net.kaba.customerservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

//creer un bean global config avec cette annotation
//au demarrage  il creer un objet config avec des parametres de global param
@ConfigurationProperties(prefix = "global.params")
public record GlobalConfig(int p1,int p2) {


}
