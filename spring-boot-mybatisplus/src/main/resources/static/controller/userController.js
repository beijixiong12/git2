var app=angular.module("myAppp",[]);
app.controller("myCon",function ($scope,$http) {
    $http.get("/test").then(function (response) {

        $scope.hello=response.data.name
        $scope.age=response.data.age
    })
})
