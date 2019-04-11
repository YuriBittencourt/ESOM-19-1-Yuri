package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MyService extends DynamicResource implements IMyService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMyService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMyService>() {
    
    @Override
    public IMyService create() {
      return new MyService();
    }
    
    @Override
    public IMyService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MyService(resourceRepository, resource);
    }
  
  };

  public MyService() {
    super(IMyService.TYPE_ID);
  }
  
  public MyService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMyService.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyCall> selectCall() {
    return _getList(com.actifsource.simpleservice.generic.javamodel.IMyCall.class, com.actifsource.simpleservice.generic.GenericPackage.myService_call);
  }

  public MyService setCall(java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IMyCall> call) {
    _setList(com.actifsource.simpleservice.generic.GenericPackage.myService_call, call);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MyService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(com.actifsource.simpleservice.generic.javamodel.IMyCall.class, com.actifsource.simpleservice.generic.GenericPackage.myService_call, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static com.actifsource.simpleservice.generic.javamodel.IMyService selectToMeCall(com.actifsource.simpleservice.generic.javamodel.IMyCall object) {
    return _getToMeSingle(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.IMyService.class, com.actifsource.simpleservice.generic.GenericPackage.myService_call, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,88c11fba-5bca-11e9-a8cd-29004858a597,frHlaEdwkJQ+gHl4Re2EzxHXYjY=] */
