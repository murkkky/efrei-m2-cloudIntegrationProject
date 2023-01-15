package arradibouchakour.application.services;

import arradibouchakour.application.model.Team;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import java.io.StringReader;

@Component
public class MapTeam {

    @SneakyThrows
    public Team mapTeamMethod(String csvLine) {
        CSVReader reader = new CSVReaderBuilder(new StringReader(csvLine))
                .withCSVParser(new CSVParserBuilder()
                        .withSeparator(';')
                        .build())
                .build();

        String[] data = reader.readNext();

        return Team.builder()
                .id(Long.parseLong(data[0]))
                .name(data[1])
                .playerID(data[2])
                .build();
    }
}
