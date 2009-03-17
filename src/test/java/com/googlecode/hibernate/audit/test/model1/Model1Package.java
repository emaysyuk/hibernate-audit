/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.hibernate.audit.test.model1;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.googlecode.hibernate.audit.test.model1.Model1Factory
 * @model kind="package"
 * @generated
 */
public interface Model1Package extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model1";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://hibernate-audit.googlecode.com/test/model1/1.0.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "model1";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Model1Package eINSTANCE = com.googlecode.hibernate.audit.test.model1.impl.Model1PackageImpl.init();

    /**
     * The meta object id for the '{@link com.googlecode.hibernate.audit.test.model1.impl.Model1ParentImpl <em>Parent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.googlecode.hibernate.audit.test.model1.impl.Model1ParentImpl
     * @see com.googlecode.hibernate.audit.test.model1.impl.Model1PackageImpl#getModel1Parent()
     * @generated
     */
    int MODEL1_PARENT = 0;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL1_PARENT__CHILDREN = 0;

    /**
     * The number of structural features of the '<em>Parent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL1_PARENT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link com.googlecode.hibernate.audit.test.model1.impl.Model1ChildImpl <em>Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.googlecode.hibernate.audit.test.model1.impl.Model1ChildImpl
     * @see com.googlecode.hibernate.audit.test.model1.impl.Model1PackageImpl#getModel1Child()
     * @generated
     */
    int MODEL1_CHILD = 1;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL1_CHILD__PARENT = 0;

    /**
     * The number of structural features of the '<em>Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL1_CHILD_FEATURE_COUNT = 1;


    /**
     * Returns the meta object for class '{@link com.googlecode.hibernate.audit.test.model1.Model1Parent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parent</em>'.
     * @see com.googlecode.hibernate.audit.test.model1.Model1Parent
     * @generated
     */
    EClass getModel1Parent();

    /**
     * Returns the meta object for the containment reference list '{@link com.googlecode.hibernate.audit.test.model1.Model1Parent#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see com.googlecode.hibernate.audit.test.model1.Model1Parent#getChildren()
     * @see #getModel1Parent()
     * @generated
     */
    EReference getModel1Parent_Children();

    /**
     * Returns the meta object for class '{@link com.googlecode.hibernate.audit.test.model1.Model1Child <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Child</em>'.
     * @see com.googlecode.hibernate.audit.test.model1.Model1Child
     * @generated
     */
    EClass getModel1Child();

    /**
     * Returns the meta object for the container reference '{@link com.googlecode.hibernate.audit.test.model1.Model1Child#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent</em>'.
     * @see com.googlecode.hibernate.audit.test.model1.Model1Child#getParent()
     * @see #getModel1Child()
     * @generated
     */
    EReference getModel1Child_Parent();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Model1Factory getModel1Factory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link com.googlecode.hibernate.audit.test.model1.impl.Model1ParentImpl <em>Parent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.googlecode.hibernate.audit.test.model1.impl.Model1ParentImpl
         * @see com.googlecode.hibernate.audit.test.model1.impl.Model1PackageImpl#getModel1Parent()
         * @generated
         */
        EClass MODEL1_PARENT = eINSTANCE.getModel1Parent();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL1_PARENT__CHILDREN = eINSTANCE.getModel1Parent_Children();

        /**
         * The meta object literal for the '{@link com.googlecode.hibernate.audit.test.model1.impl.Model1ChildImpl <em>Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.googlecode.hibernate.audit.test.model1.impl.Model1ChildImpl
         * @see com.googlecode.hibernate.audit.test.model1.impl.Model1PackageImpl#getModel1Child()
         * @generated
         */
        EClass MODEL1_CHILD = eINSTANCE.getModel1Child();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL1_CHILD__PARENT = eINSTANCE.getModel1Child_Parent();

    }

} //Model1Package
