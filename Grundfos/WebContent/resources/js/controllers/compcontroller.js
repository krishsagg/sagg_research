'use strict';

/**
 * ComponentController
 * @constructor
 */
var ComponentController = function($scope, $http) {
    $scope.fetchCompList = function() {
        $http.get('comp/complist.json').success(function(compList){
            $scope.comp = compList;
        });
    };

    $scope.addNewComp = function(newComp) {
        $http.post('comp/addComp/' + newComp).success(function() {
            $scope.fetchCompList();
        });
        $scope.compName = '';
    };

    $scope.removeComp = function(comp) {
        $http.delete('comp/removeComp/' + comp).success(function() {
            $scope.fetchCompList();
        });
    };

    $scope.removeAllEntities = function() {
        $http.delete('comp/removeAllComp').success(function() {
            $scope.fetchCompList();
        });

    };

    $scope.fetchCompList();
};