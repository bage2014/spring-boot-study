// angularjs params
var app = angular.module('IndexApp', []);	
app.controller('IndexController', function($scope, $http) {
	$scope.listTbodyThreads = [];
	$scope.listSessions = [];
	$scope.listProcesses = [];
	$scope.memoryInformations = {};	// 
	$scope.cpu = {};	// 
	$scope.databaseInformations = {};
	$scope.listsql = {};
	$scope.pageLimit = 5;
});

var eChartMemory = null;
var dataMemory = [];


$(document).ready(function() {
	
});
