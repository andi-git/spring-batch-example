package at.ahammer.spring.batch.example;

import at.ahammer.spring.batch.example.model.Report;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report item) throws Exception {
        System.out.println("Processing..." + item);
        return item;
    }
}
