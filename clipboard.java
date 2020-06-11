import java.awt.*;
import java.awt.datatransfer.*;

class ClipBoard{
    public static void main(String args[])
    {
        Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

        try{
            if(t!=null && t.isDataFlavorSupported(DataFlavor.stringFlavor)){
                String text = (String)t.getTransferData(DataFlavor.stringFlavor);
                System.out.println("\nCurrent ClipBoard data is:\n"+text);
                text = "I changed clipboard text";
                    
                StringSelection ss = new StringSelection(text);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
                    
                System.out.println("\nChanged ClipBoard data is:\n"+text);
            }
        }
        catch(Exception e)
        {

        }
    }
}