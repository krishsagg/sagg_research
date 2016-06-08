'use strict';

/**
 * EntityController
 * @constructor
 */
var EntityController = function($scope, $http) {
    $scope.fetchEntityList = function() {
        $http.get('entity/entitylist.json').success(function(entityList){
            $scope.entities = entityList;
        });
    };

    $scope.addNewEntity = function(newEntity) {
        $http.post('entity/addEntity/' + newEntity).success(function() {
            $scope.fetchEntityList();
        });
        $scope.entityName = '';
    };

    $scope.removeEntity = function(entity) {
        $http.delete('entity/removeEntity/' + entity).success(function() {
            $scope.fetchEntityList();
        });
    };

    $scope.removeAllEntities = function() {
        $http.delete('entity/removeAllEntity').success(function() {
            $scope.fetchEntityList();
        });

    };

    $scope.fetchEntityList();
};