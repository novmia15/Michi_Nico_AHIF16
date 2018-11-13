package dal;

import data.Measurement;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAL implements Serializable
{
	private static final String FILE_PATH = "measurements.ser";
	
  public void writeData(ArrayList<Measurement> measurements)
  {
    try
    {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			for(Measurement m : measurements)
      {
				System.out.println(m.getKennzeichen());
				oos.writeObject(m);
      }
    }
		catch (IOException ex)
		{
			Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
		}
  }

  public ArrayList<Measurement> readData()
  {
		ArrayList<Measurement> measurements = new ArrayList<>();
    try
    {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
      for (int i = 0; i < ois.readInt(); i++)
      {
        measurements.add((Measurement)ois.readObject());        
      }
    }
		catch (IOException ex)
		{
			Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch (ClassNotFoundException ex)
		{
			Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
		}
		return measurements;
  }
}
