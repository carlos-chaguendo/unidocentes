var services = angular.module('unidocentesApp.services', ['ngResource']);

var baseUrl = 'http://localhost:9090/Unidocentes/';
//servicioprograma
services.factory('ProgramasFactory', function ($resource) {
    return $resource(baseUrl + '/programa', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('ProgramaFactory', function ($resource) {
    return $resource(baseUrl + '/programa/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//Servicio Rol

services.factory('RolFactory', function ($resource) {
    return $resource(baseUrl + '/rol', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('RolFactory', function ($resource) {
    return $resource(baseUrl + '/rol/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio EstadoUsuario

services.factory('EstadousuarioFactory', function ($resource) {
    return $resource(baseUrl + '/estadousuario', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('EstadousuarioFactory', function ($resource) {
    return $resource(baseUrl + '/estadousuario/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
// servicio Docente
services.factory('DocenteFactory', function ($resource) {
    return $resource(baseUrl + '/docente', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('ProgramaFactory', function ($resource) {
    return $resource(baseUrl + '/programa/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
// servicio ASignatura
services.factory('AsignaturaFactory', function ($resource) {
    return $resource(baseUrl + '/asignatura', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('AsignaturaFactory', function ($resource) {
    return $resource(baseUrl + '/asignatura/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio MIcrocurriculo
services.factory('MicrocurriculoFactory', function ($resource) {
    return $resource(baseUrl + '/microcurriculo', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('MicrocurriculoFactory', function ($resource) {
    return $resource(baseUrl + '/microcurriculo/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
// servicio Bibliografia
services.factory('BibliografiaFactory', function ($resource) {
    return $resource(baseUrl + '/bibliografia', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('BibliografiaFactory', function ($resource) {
    return $resource(baseUrl + '/bibliografia/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio Planeador
services.factory('PlaneadoresFactory', function ($resource) {
    return $resource(baseUrl + '/planeadores', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('PlaneadoresFactory', function ($resource) {
    return $resource(baseUrl + '/planeadores/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
// servicio BItacoras
services.factory('BitacoraFactory', function ($resource) {
    return $resource(baseUrl + '/bitacora', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('BitacoraFactory', function ($resource) {
    return $resource(baseUrl + '/bitacora/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
// servicio EstadoMicrocurr
services.factory('EstadoMicroFactory', function ($resource) {
    return $resource(baseUrl + '/estadoMicro', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('EstadoMicroFactory', function ($resource) {
    return $resource(baseUrl + '/estadoMicro/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});

//servicio unidad Microcurriculo
services.factory('UnidadMicrocurFactory', function ($resource) {
    return $resource(baseUrl + '/unidadMicrocur', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('UnidadMicrocurFactory', function ($resource) {
    return $resource(baseUrl + '/unidadMicrocur:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio INfadicional
services.factory('InfAdicionalFactory', function ($resource) {
    return $resource(baseUrl + '/infAdicional', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('InfAdicionalFactory', function ($resource) {
    return $resource(baseUrl + '/infAdicional/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio Estrategia
services.factory('EstrategiaFactory', function ($resource) {
    return $resource(baseUrl + '/estrategia', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('EstrategiaFactory', function ($resource) {
    return $resource(baseUrl + '/estrategia/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio Evaluaciones
services.factory('EvaluacionFactory', function ($resource) {
    return $resource(baseUrl + '/evaluacion', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('EvaluacionFactory', function ($resource) {
    return $resource(baseUrl + '/evaluacion/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio funciones

services.factory('FuncionesFactory', function ($resource) {
    return $resource(baseUrl + '/programa', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('FuncionesFactory', function ($resource) {
    return $resource(baseUrl + '/funciones/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio Historiales
services.factory('HistorialFactory', function ($resource) {
    return $resource(baseUrl + '/historial', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('HistorialFactory', function ($resource) {
    return $resource(baseUrl + '/historial/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio Lenguaje
services.factory('LenguajeFactory', function ($resource) {
    return $resource(baseUrl + '/lenguaje', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('LenguajeFactory', function ($resource) {
    return $resource(baseUrl + '/lenguaje/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//servicio TemasMicrocurr
services.factory('TemasMicroFactory', function ($resource) {
    return $resource(baseUrl + '/temasMicro', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('TemasMicroFactory', function ($resource) {
    return $resource(baseUrl + '/temasMicro/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});

//servicio Temas Dados
services.factory('TemasDadosFactory', function ($resource) {
    return $resource(baseUrl + '/temasDados', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('TemasDadosFactory', function ($resource) {
    return $resource(baseUrl + '/temasDados/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//Servicio TipoBibliografia
services.factory('TipoBibliografiaFactory', function ($resource) {
    return $resource(baseUrl + '/tipoBibliografia', {}, {
        query: { method: 'GET', tipoBibliografia: true },
        create: { method: 'POST' }
    })
});

services.factory('TipoBibliografiaFactory', function ($resource) {
    return $resource(baseUrl + '/tipoBibliografia/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
//SERVICIO Usuario
services.factory('UsuarioFactory', function ($resource) {
    return $resource(baseUrl + '/usuario', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('UsuarioFactory', function ($resource) {
    return $resource(baseUrl + '/usuario/:id', {}, {
        show: { method: 'GET', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});
