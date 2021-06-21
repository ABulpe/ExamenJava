package es.iesrafaelalberti.daw.prog.examen;

public class MyException extends Exception{

    private String codigo;

    public MyException(String codigo) {
        super();
        this.codigo = codigo;
    }

    @Override
    public String getMessage(){
        String message = "";
        switch (codigo){
            case "1":
                message = "";
                break;

            case "2":
                message = "";
                break;




        }
        return message;
    }


}