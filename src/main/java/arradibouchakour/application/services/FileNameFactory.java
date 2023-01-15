package arradibouchakour.application.services;

import org.springframework.integration.file.FileNameGenerator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class FileNameFactory implements FileNameGenerator {
    public String generateFileName(Message<?> message) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        return ((String) message.getHeaders()
                .get("file_name"))
                .split("\\.")[0] + timeStamp + ".json";
    }
}
