public abstract class Thing {
    
    public abstract void setName(String name);
   
    public abstract String getName();
   
}
 //INTREBARE - despre ce va vorbesc cele doua metode din clasa Thing ?

    /*RASPUNS - deoarece aceasta clasa este abstracta, dupa cum e si mentionat ---v

      ATENTIE! tipul Thing - reprezinta o clasa abstracta prin care se subintelege orice lucru! 
      (adica - direct nu putem instantia obiecte din aceasta clasa!).
 
      clasa fiind abstracta, direct nu putem instantia obiecte din aceasta clasa, de aceea clasele care mostenesc clasa Thing trebuie sa le implementeze in mod concret.

    */