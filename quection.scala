object quection extends App{
    def convert(x:Double):Double=x*1.8+32;
      println(convert(35)+"F");

        def volume(y:Double):Double=22*y*y*y*4/(3*7);
          println(volume(5)+"m^2");

            def cal(x:Int):Double={
                    if(x<=50){
                           (   (24.95*x)*60/100+3);

                                    }else{
                                              (24.95*60/100)*x+3+(x-50)*0.75;


                                                    }


                                                      }
              println(cal(60)+"rs");



}
