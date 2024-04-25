import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Check{
    
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
ArrayList<Card> cards = new ArrayList<>();
System.out.println("Enter the name of the cards file:");
String fileName= sc.nextLine();
try {
File file = new File(fileName);
Scanner fileReader =new Scanner(file);

while(fileReader.hasNextLine()){
    
    String currentFileLine = fileReader.nextLine();
StringTokenizer cardList = new StringTokenizer(currentFileLine," ");
while(cardList.hasMoreTokens()){
StringTokenizer cardAttributes = new StringTokenizer(cardList.nextToken(),",");
cards.add(new Card(cardAttributes.nextToken(), cardAttributes.nextToken(), cardAttributes.nextToken()));
}
Boolean equals = false;
Boolean unqiue = false;
outer:
for(int i =0;i<cards.size();i++){
    
    for(int j =i+1;j<cards.size();j++){
        equals = cards.get(i).equal(cards.get(j));
        if (equals == false){
            break outer;
        }
    }



}
outer2:
for(int i =0;i<cards.size();i++){
    
    for(int j =i+1;j<cards.size();j++){
        unqiue = cards.get(i).unique(cards.get(j));
        if (unqiue == false){
            break outer2;
        }
    }



}



System.out.println("Processing: "+currentFileLine);
if (unqiue || equals){
    System.out.println("Valid");
} else {
    System.out.println("Invalid");
}


cards.clear();


}} catch(Exception e){
    System.out.println(e);
    }

System.out.println("Done");
}




}
