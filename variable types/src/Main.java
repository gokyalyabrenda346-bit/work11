//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University one=new University("Applied Object Oriented programming",3.3,30,"Abigail","twenty");
        University two=new University("Graphics design",7.8,20,"Niggaz","thirty");
        University three=new University("Computer Networks",2.9,60,"Kaufman","Forty");
        one.money();
        one.money();
        one.money();
        int averageattendace=(one.attendance+ two.attendance+ three.attendance)/3;
        }
    }
