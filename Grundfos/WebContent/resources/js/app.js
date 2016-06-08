'use strict';

var AngularSpringApp = {};

var App = angular.module('Grunfoss', ['Grunfoss.filters', 'Grunfoss.services', 'Grunfoss.directives']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/entity', {
        templateUrl: 'entity/layout',
        controller: entitycontroller
    });

    $routeProvider.when('/comp', {
        templateUrl: 'component/layout',
        controller: compcontroller
    });

    $routeProvider.otherwise({redirectTo: '/entity'});
}]);
