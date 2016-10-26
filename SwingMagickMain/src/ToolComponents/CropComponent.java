package ToolComponents;

import ToolComponents.CustomComponents.CustomButton;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Created by alex on 10/23/2016.
 */
public class CropComponent extends ToolComponent
{
    private static final String WRAP_GROW_STRING = "wrap, growx";

    private JButton resizeButton;
    private JButton flipButton;
    private JButton rotateButton;
    private CustomButton cropButton;

    public CropComponent()
    {
        setLayout(new MigLayout());
        resizeButton = new JButton("Resize");
        flipButton = new JButton("Flip");
        rotateButton = new JButton("Rotate");

        add(cropButton, WRAP_GROW_STRING);
        add(resizeButton, WRAP_GROW_STRING);
        add(flipButton, WRAP_GROW_STRING);
        add(rotateButton, WRAP_GROW_STRING);
        cropButton = new CustomButton("./out/images/crop.png");
        cropButton.setRolloverIcon(new ImageIcon("./out/images/crop-hover.png"));
        cropButton.setPressedIcon(new ImageIcon("./out/images/crop-clicked.png"));
        add(cropButton);
    }
}
