#include<iostream>
using namespace std;
class vehical
{
    public:
    string brand="tata";
    void get()
    {
        cout<<"this is my new car\n";
    }
};
class car:public vehical
{
    public:
    string model="altroz";
    void set()
    {
        cout<<"\nnew car..!";
    }
};
int main()
{
    car c;
    c.get();
    cout<<c.brand+"\n"+c.model;
    c.set();
    return 0;
}