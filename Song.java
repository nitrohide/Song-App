import java.io.*;
public class Song{
  private String name;
  private Integer year;
  private Integer numberOfWriters;
  private String[] writers;
  private Integer rating;
  public static void main(String[] args){
  }
  public Song(String name){
    this.name=name;
    year=0;
    numberOfWriters=0;
    writers=new String[50];
    rating=0;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setYear(int year){
    this.year=year;
  }
  public int getYear(){
    return year;
  }
  public void setRating(int rating){
    this.rating=rating;
  }
  public int getRating(){
    return rating;
  }
  public void addWriter(String writerName){
    for (int i=0;i<writers.length;i++){
      if (writers[i]==null){
    writers[i]=writerName;
    numberOfWriters++;
    break;
      }
    }
  }
  public String[] getWriters(){
    return writers;
  }
  public int getNumberOfWriters(){
    return numberOfWriters;
  }
  public String getWriterAtIndex(int index){
    if (writers[index]==null || index>numberOfWriters)
    return null;
    else
    return writers[index];
  }
  public String toString(){
    return name+","+year+","+rating;
  }
  public boolean equals(Object other){
    if (other instanceof Song){
      Song p = (Song)other;
      int equals = 0;
      for (int i = 0; i < writers.length; i++){
        if (equals == -1){
          break;
        }
        for (int j = 0; j < writers.length; j++){
          if (this.writers[i] == p.writers[j]){
            break;
          }
          if (j == writers.length - 1 && this.writers[i] != p.writers[j]){
            same = -1;
          }
        }
      }
      if (this.numberOfWriters != p.numberOfWriters){
        return false;
      }
      else{
        return (this.name == p.getName() && this.year == p.getYear() && same == 0);
      }
    }
    else{
      return false;
    }
  }
  public int compareTo (Song other){
    String song1=this.getName();
    String song2=other.getName();
    if (song1.compareTo(song2)==0){
      return 0;
    }
    else if(song1.compareTo(song2)<0){
      return -1;
    }
    else{
      return 1;
    }
  }
}
