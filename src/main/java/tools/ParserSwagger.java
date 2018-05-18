package tools;
import io.swagger.parser.SwaggerParser;
import io.swagger.models.Swagger;

public class ParserSwagger {

    private String pathConfigFile;
    private Swagger swaggerFile;

    public ParserSwagger(){}

    public ParserSwagger(String pathConfigFile )
    {
        this.pathConfigFile = pathConfigFile;
        swaggerFile = new SwaggerParser().read(pathConfigFile);
    }

    public String getPathConfigFile() {
        return pathConfigFile;
    }

    public Swagger getSwaggerFile() {
        return swaggerFile;
    }

    public void setSwaggerFile(Swagger swaggerFile) {
        this.swaggerFile = swaggerFile;
    }

    public void setPathConfigFile(String pathConfigFile) {
        this.pathConfigFile = pathConfigFile;
    }
}
