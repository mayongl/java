class B extends A{
    int x = 1;
    int y;
    public B(){
        super();
        PrintFields();
        y = -1;
        PrintFields();
    }

    public void PrintFields(){
        System.out.println(x);
        System.out.println(y);
    }
}
