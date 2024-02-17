package kg.alfit.bankingapp.domain.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.SneakyThrows;

@Converter
public class ObjectConverter implements AttributeConverter<Object, String> {
    public static ObjectMapper objectMapper = new ObjectMapper();


    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object o) {
        return objectMapper.writeValueAsString(o);
    }

    @Override
    public Object convertToEntityAttribute(String s) {
        return objectMapper.convertValue(s, Object.class);
    }
}
