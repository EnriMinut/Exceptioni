import org.example.ZanniNotFound;

void main(){
    try{
        f();
    }
    catch(ZanniNotFound e){
        IO.println();
    }

}


static void f() {
    g();
}

private static void g() {
    h();
}

private static void h() {
    throw new ZanniNotFound("Evviva le eccezioni", 5);
}
