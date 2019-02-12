
  //List of Employees
  //Fields of employees
var employees_list =[
{name: 'manidhar', age: 20, salary: 15000, dob: '04-04-1998'},
{name: 'shantanu', age: 22, salary: 4800, dob: '24-05-1996'},
{name: 'vijay', age: 21, salary: 2000, dob: '14-10-1999'},
{name: 'yashwanth', age: 23, salary: 25000, dob: '06-07-2000'},
{name: 'mahesh', age: 22, salary: 600, dob: '04-04-1995'},
{name: 'abhiram', age: 20, salary: 400, dob: '03-04-1998'}
];
document.write("(a.) <br> List of Empoloyees are:- <br>")
employees_list.forEach(
	function(TTN){
		document.write(JSON.stringify(TTN) + "<br><br>")
	}
)


//filter all employees with salary greater than 5000
document.write("(b.) <br> filter all employees with salary greater than 5000 are:- <br>")
a=0
employees_list.forEach(
	function(TTN){
		if (TTN.salary >= 5000){
			a++
			document.write(a + "." + TTN.name + "<br>")
		}
	}
)

//group employees on the basis of their age
Array.prototype.groupBy = function(cgroup) {
    return this.reduce(function(groups, item) {
      const val = item[cgroup]
      groups[val] = groups[val] || []
      groups[val].push(item)
      return groups
    }, {})
  }
document.write("<br> (c.) <br> group employees on the basis of their age:- <br>")
document.write("<br> " + JSON.stringify(employees_list.groupBy("age")) + "<br>");


//fetch employees with salary less than 1000 and age greater than 20. Then give them an increment 5 times their salary.

document.write("<br> (d.) <br> All employees with salary less than 1000 and age greater than 20 are:- <br>")
b = 0
employees_list.forEach(
    function(TTN){
        if (TTN.salary < 1000 && TTN.age>20){
            b++
            document.write(b + ". " + TTN.name + ": " + TTN.salary + "<br>")
        }
    }    
)

document.write("<br> And now their salaries are incremented by 5 times:- <br>")
c = 0
employees_list.forEach(
    function(TTN){
        if (TTN.salary < 1000 && TTN.age>20){
            c++
            TTN.salary *=5
            document.write(c + ". " + TTN.name + ": " + TTN.salary + "<br>")
        }
    }    
)