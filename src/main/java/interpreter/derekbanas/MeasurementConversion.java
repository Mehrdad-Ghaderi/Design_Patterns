package interpreter.derekbanas;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MeasurementConversion {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your Question?");
        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion(); //from what?
        String toConversion = question.getToConversion();

        double quantity = question.getQuantity();

        try {
            Class tempClass = Class.forName(fromConversion);

            Constructor constructor = tempClass.getConstructor();

            Object convertFrom = (Expression) constructor.newInstance();

            Class[] methodParameters = new Class[]{Double.TYPE};

            Method conversionMethod = tempClass.getMethod(toConversion, methodParameters);

            Object[] params = new Object[]{new Double(quantity)};

            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            String answerToQuestion = question.getResponse() + toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQuestion);
            frame.dispose();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
