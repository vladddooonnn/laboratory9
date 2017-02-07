package com.example.lab9;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import com.example.maxim.lab9.R;

public class MainActivity extends AppWidgetProvider {

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        // здесь ваш текст
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
                         int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
        views.setTextViewText(R.id.tv, "{ХЛАМ!!");
        appWidgetManager.updateAppWidget(appWidgetIds, views);


        // здесь ваш текст
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
        // здесь ваш текст
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
        // здесь ваш текст
    }

}
