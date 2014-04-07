package com.sunshine.designpatter.adapter;/** * 适配器模式<br/> * 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口*兼容而不能一起工作的那*类可以一起工作。 适用性 *  * 1.你想使*一个已经存在的类，而它的接口不符合你的需求。 *  * 2.你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那*接口 可能不一定兼容的类）协同工作。 *  * .（仅适用于对象Adapter）你想使用一些已经存在的子类，但是不可能对每一个都进行 子类化以匹配它们的接口。对象适配器可以适配它的父类接口。 *  * 参与者 *  * 1.Target 定义Client使用的与特定领域相关的接口。 *  * 2.Client 与符合Target接口的对象协同。 *  * 3.Adapt*e 定义一个已经存在的接口，这个接口需要适配。 *  * 4.Adapter 对Adaptee的接口与Target接口进行适配 *  * @author sunshine *  */public class Test {	public static void main(String[] args) {		Target target = new Adapter(new Adaptee());		target.adapteeMethod();		target.adapterMethod();	}}