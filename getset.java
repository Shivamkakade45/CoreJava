class getset{
    private String Color;
    private int num;

    public String getColor(){
          return Color;
    }
    public int  getnum(){
          return num ;
    }
    public void setColor(String Color){
          this.Color = Color;
    }

    public static void main(String[] args) {
        getset s1 = new getset();
        s1.Color = ("red");
        System.out.println(s1.getColor());

        getset s2 = new getset();
        s2.setColor("orange");
        System.out.println(s2.getColor());

        getset s3 = new getset();
        s3.num = 10;
        System.out.println(s3.getnum());
    }
    
        
    }
