/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.R;

/**
 * Изпользуется для хранения всех текстовых констант
 *
 * @author maxxl
 */
public class R
{
   /**
    * Название тегов
    */
   public static class TagName
   {
	final public static String p = "p";
	final public static String b = "b";
	final public static String div = "div";

   }

   /**
    * Названия атрибутов
    */
   public static class AttributeName
   {
	/** Имя атрибута: margin-left - отступ слева*/final public static String margin_left = "margin-left";
	/** Имя атрибута: margin-right - отступ справа*/final public static String margin_right = "margin-right";
	/** Имя атрибута: margin-top - отступ сверху*/final public static String margin_top = "margin-top";
	/** Имя атрибута: margin-bottom - отступ снизу*/final public static String margin_bottom = "margin-bottom";
	/** Имя атрибута: padding-left - отступ слева*/final public static String padding_left = "padding-left";
	/** Имя атрибута: padding-right - отступ справа*/final public static String padding_right = "padding-right";
	/** Имя атрибута: padding-bottom - отступ снизу*/final public static String padding_top = "padding-top";
	/** Имя атрибута: padding-bottom - отступ снизу*/final public static String padding_bottom = "padding-bottom";
	/** Имя атрибута: text-align - выравнивание по центру */final public static String text_align = "text-align";
	/** Имя атрибута: text-transform - трансформирование текста */final public static String text_transform = "text-transform";
	/** Имя атрибута: width - ширина */	 final public static String width = "width";
	/** Имя атрибута: height - высота */ final public static String height = "height";
	/** Имя атрибута: border-bottom - подчеркивание */final public static String border_bottom = "border-bottom";
   }
   /**
    * Единицы измерения для атрибутов
    */
   public static class AttributeMeasurement
   {
	/** Единица измерения: px - пиксель */final public static String px = "px";
	/** Единица измерения: % - процент */final public static String percent = "%";
	/** Единица измерения: em - em */    final public static String em = "em";
	/** Единица выравнивания: left - левая сторона */final public static String left = "left";
	/** Единица выравнивания: right - правая сторона */final public static String right = "right";
	/** Единица выравнивания: center - центр */final public static String center = "center";
	/** Единица трансформирования текста: uppercase - заглавные буквы */final public static String uppercase = "uppercase";
	/** Единица жирности контура: border_light - 2px solid black */	final public static String border_light = "2px solid black";
	/** Единица жирности контура: border_medium - 3px solid black */final public static String border_medium = "3px solid black";
	/** Единица отсутствия постфикса: not_measurement - "" */final public static String not_measurement = "";
	/** Единица стандартного отступа для подчеркивания контура: def_paddingt - "7" */
	final public static String def_padding = "7";

   }

   /** 
    * Строковые константы атрибутов(ключей) которые будут использоваться для тегов
    */
   public static class Text
   {
	final public static String border_light = "Подчеркивание";
	final public static String border_medium = "Жирное подчеркивание";
	final public static String def_padding = "Стандартный отступ";
   }

}
