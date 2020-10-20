package hello;

import org.springframework.beans.factory.annotation.Value;

public class Version {

   @Value("${application.version}")
   private String appVersion;

   public String getVersion() {
	   return "v2.0";
   }

}
