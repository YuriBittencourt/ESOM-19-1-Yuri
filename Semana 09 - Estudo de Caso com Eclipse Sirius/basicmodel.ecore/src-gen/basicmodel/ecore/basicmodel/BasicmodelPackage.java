/**
 */
package basicmodel.ecore.basicmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see basicmodel.ecore.basicmodel.BasicmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BasicmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basicmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/basicmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicmodelPackage eINSTANCE = basicmodel.ecore.basicmodel.impl.BasicmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link basicmodel.ecore.basicmodel.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see basicmodel.ecore.basicmodel.impl.BoxImpl
	 * @see basicmodel.ecore.basicmodel.impl.BasicmodelPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link basicmodel.ecore.basicmodel.impl.StuffImpl <em>Stuff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see basicmodel.ecore.basicmodel.impl.StuffImpl
	 * @see basicmodel.ecore.basicmodel.impl.BasicmodelPackageImpl#getStuff()
	 * @generated
	 */
	int STUFF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUFF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Stuff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUFF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stuff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUFF_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link basicmodel.ecore.basicmodel.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see basicmodel.ecore.basicmodel.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the attribute '{@link basicmodel.ecore.basicmodel.Box#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see basicmodel.ecore.basicmodel.Box#getName()
	 * @see #getBox()
	 * @generated
	 */
	EAttribute getBox_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link basicmodel.ecore.basicmodel.Box#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see basicmodel.ecore.basicmodel.Box#getContent()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Content();

	/**
	 * Returns the meta object for class '{@link basicmodel.ecore.basicmodel.Stuff <em>Stuff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stuff</em>'.
	 * @see basicmodel.ecore.basicmodel.Stuff
	 * @generated
	 */
	EClass getStuff();

	/**
	 * Returns the meta object for the attribute '{@link basicmodel.ecore.basicmodel.Stuff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see basicmodel.ecore.basicmodel.Stuff#getName()
	 * @see #getStuff()
	 * @generated
	 */
	EAttribute getStuff_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicmodelFactory getBasicmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link basicmodel.ecore.basicmodel.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see basicmodel.ecore.basicmodel.impl.BoxImpl
		 * @see basicmodel.ecore.basicmodel.impl.BasicmodelPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX__NAME = eINSTANCE.getBox_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__CONTENT = eINSTANCE.getBox_Content();

		/**
		 * The meta object literal for the '{@link basicmodel.ecore.basicmodel.impl.StuffImpl <em>Stuff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see basicmodel.ecore.basicmodel.impl.StuffImpl
		 * @see basicmodel.ecore.basicmodel.impl.BasicmodelPackageImpl#getStuff()
		 * @generated
		 */
		EClass STUFF = eINSTANCE.getStuff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUFF__NAME = eINSTANCE.getStuff_Name();

	}

} //BasicmodelPackage
