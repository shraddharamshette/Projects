#include <iostream>

using namespace std;

class student
{
    public:
    void set();
    void get()
    {
        cout<<"this is get inide functio\n";
    }
};
void student::set()
{
    cout<<"this is set outside function";
    }
int main()
{
    student s;
    s.get();
    s.set();
}