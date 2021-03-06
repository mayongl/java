import java.io.*;

public class GameSaverTest {
  public static void main (String[] args) {
    GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
    GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bow", "sword", "dust"});
    GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});

    //此处有改变人物状的代码
    try {
      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
      os.writeObject(one);
      os.writeObject(two);
      os.writeObject(three);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    one = null;
    two = null;
    three = null;

    try {
      ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
      GameCharacter oneRestore = (GameCharacter) is.readObject();
      GameCharacter twoRestore = (GameCharacter) is.readObject();
      GameCharacter threeRestore = (GameCharacter) is.readObject();

      System.out.println("One's type: " + oneRestore.getType());
      System.out.println("Two's type: " + twoRestore.getType());
      System.out.println("Three's type: " + threeRestore.getType());
    }

    catch (IOException ex) {
      ex.printStackTrace();
    }
    catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }
  }
}
