angular.module('Grunfoss.Common')
    .constant('CURRENT_BACKEND', 'firebase')
    //.constant('CURRENT_BACKEND', 'node')
    .service('EndpointConfigService', function($rootScope, CURRENT_BACKEND) {
        var service = this,
            endpointMap = {
                firebase: { URI: 'https://my-first-angello.firebaseio.com/', root: 'clients/', format: '.json' },
                node: { URI: 'http://localhost:3000/', root: 'api/clients/', format: ''}
            },
            currentEndpoint = endpointMap[CURRENT_BACKEND],
            userId = null,
            backend = CURRENT_BACKEND;

        service.getUrl = function(model) {
            return currentEndpoint.URI + currentEndpoint.root + userId + model;
        };

        service.getUrlForId = function(model, id) {
            return service.getUrl(model) + id + currentEndpoint.format;
        };

        service.getCurrentBackend = function() {
            return backend;
        };

        service.getCurrentFormat = function() {
            return currentEndpoint.format;
        };

        service.getCurrentURI = function() {
            return currentEndpoint.URI;
        };

        $rootScope.$on('onCurrentUserId', function(event, id){
            userId = id;
        });
    });
