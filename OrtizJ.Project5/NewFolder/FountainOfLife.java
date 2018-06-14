public class FountainOfLife
{
  public double elixirOfDeath(int elixir, int poison, int pool)
  {
    double seconds = 0.0;
    if(elixir >= 1 && elixir <= 10000 && poison >= 1 && poison <= 10000 && pool >= 1 && pool <= 10000)
    {
      while(poison < 1/2*pool)
      {
        poison = poison + 1;
        elixir = elixir + 1;
        seconds = seconds + 1.0;
      } 
    }
    
    return seconds;
  }

}