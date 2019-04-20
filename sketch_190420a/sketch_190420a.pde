PImage backgroundImage;
int x=50;
int xSpeed=40;
int y=30;
void setup(){
  size(1000,1000);
  backgroundImage=loadImage("beach.jpg");
}
void draw(){
  ellipse (x,450,100,100);
  stroke(45,780,0);
  fill(200,200,0);
  x+=5;
  image(backgroundImage,0,0);
  if(x>100){
    xSpeed= -xSpeed;
  }
  y+=5;
     
     
     

  
}
