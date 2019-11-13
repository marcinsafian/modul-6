package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String typeOfTask, String taskName, String colorWhereOrWhatToBuy, String usingQuantityOrWhatToPaint) {
        switch (typeOfTask) {
            case SHOPPING:
                return new ShoppingTask(taskName, colorWhereOrWhatToBuy, Double.parseDouble(usingQuantityOrWhatToPaint));
            case PAINTING:
                return new PaintingTask(taskName, colorWhereOrWhatToBuy, usingQuantityOrWhatToPaint);
            case DRIVING:
                return new DrivingTask(taskName, colorWhereOrWhatToBuy, usingQuantityOrWhatToPaint);
            default:
                return null;
        }
    }
}
