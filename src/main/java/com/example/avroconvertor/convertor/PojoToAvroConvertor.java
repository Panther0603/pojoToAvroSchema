package com.example.avroconvertor.convertor;

import com.example.avroconvertor.pojo.Student;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.specific.SpecificData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PojoToAvroConvertor {

    public static void main(String[] args) {
        // to convert from pojo to Schema there is only one dependency needed
//        <dependency>
//			<groupId>org.apache.avro</groupId>
//			<artifactId>avro</artifactId>
//			<version>1.11.1</version>
//		</dependency>

        Schema schema= ReflectData.get().getSchema(Student.class);
        System.out.println(schema.toString(true));


        // we can copy it or we can save it directly to some location

        try {
            File schemaFile= new File("src/main/resources/avro.schema/Student.avsc");
            FileWriter fileWriter=new FileWriter(schemaFile);
            fileWriter.append(schema.toString(true));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
