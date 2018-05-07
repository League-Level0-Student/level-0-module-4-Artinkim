void setup()
{
size(800,600);  
}
void draw()
{
 background(0,0,0);
int eyex = mouseX;
int eyey = mouseY;
  if(mouseX >250)
  {
   eyex = 250;
  }
   if(mouseX <150)
  {
   eyex = 150;
  }
   if(mouseY >210)
  {
   eyey = 210;
  }
   if(mouseY <180)
  {
   eyey = 180;
  }
 fill(255,255,255);
 ellipse(200,200,150,100);
 ellipse(500,200,150,100);
 fill(0,0,0);
 ellipse(eyex,eyey,50,50);
 ellipse(eyex+300,eyey,50,50);
}