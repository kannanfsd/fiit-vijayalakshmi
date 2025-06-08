package com.learn.access;

class TestObject {
    int a, b;
    TestObject(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void alterPrimitives(int a, int b) {
        a = 3;
        b = 4;
    }
    void alterObjects(TestObject testObject) {
        testObject.a = 25;
        testObject.b = 62;
    }
}
public class PassObjAsArgument {
    public static void main(String[] args) {
        TestObject testObject = new TestObject(1, 2);
        System.out.println("Object state before alterPrimitives : " + testObject.a+" "+testObject.b);
        testObject.alterPrimitives(testObject.a, testObject.b);
        System.out.println("Object state after alterPrimitives : " + testObject.a+" "+testObject.b);
        testObject.alterObjects(testObject);
        System.out.println("Object state after alterObjects : " + testObject.a+" "+testObject.b);
    }
}
