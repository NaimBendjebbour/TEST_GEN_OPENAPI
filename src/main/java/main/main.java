package main;
import tools.ParserSwagger;
public class main {

    public static void main(String[] args)
    {
        ParserSwagger  test = new ParserSwagger("C:\\Users\\Naim\\Desktop\\JsonOpenAPITEST\\pnr-api.json");

        System.out.println(test.getSwaggerFile().toString());
    }
}
