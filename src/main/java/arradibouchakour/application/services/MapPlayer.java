package arradibouchakour.application.services;

import arradibouchakour.application.model.Player;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import java.io.StringReader;
@Component
public class MapPlayer {
    @SneakyThrows
    public Player mapPlayerMethod(String csvLine) {
        CSVReader reader = new CSVReaderBuilder(new StringReader(csvLine))
                .withCSVParser(new CSVParserBuilder()
                        .withSeparator(';')
                        .build())
                .build();

        String[] data = reader.readNext();

        return Player.builder().
                id(Long.parseLong(data[0]))
                .firstName(data[1])
                .lastName(data[2])
                .birthDate(data[3])
                .teamID(data[4])
                .build();
    }
}
