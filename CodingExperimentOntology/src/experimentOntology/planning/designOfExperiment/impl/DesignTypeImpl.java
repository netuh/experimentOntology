/**
 */
package experimentOntology.planning.designOfExperiment.impl;

import experimentOntology.planning.designOfExperiment.DesignDiscipline;
import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;
import experimentOntology.planning.designOfExperiment.DesignType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.impl.DesignTypeImpl#getDiscipline <em>Discipline</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DesignTypeImpl extends MinimalEObjectImpl.Container implements DesignType {
	/**
	 * The cached value of the '{@link #getDiscipline() <em>Discipline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscipline()
	 * @generated
	 * @ordered
	 */
	protected DesignDiscipline discipline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignOfExperimentPackage.Literals.DESIGN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDiscipline getDiscipline() {
		return discipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscipline(DesignDiscipline newDiscipline, NotificationChain msgs) {
		DesignDiscipline oldDiscipline = discipline;
		discipline = newDiscipline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE, oldDiscipline, newDiscipline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscipline(DesignDiscipline newDiscipline) {
		if (newDiscipline != discipline) {
			NotificationChain msgs = null;
			if (discipline != null)
				msgs = ((InternalEObject)discipline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE, null, msgs);
			if (newDiscipline != null)
				msgs = ((InternalEObject)newDiscipline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE, null, msgs);
			msgs = basicSetDiscipline(newDiscipline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE, newDiscipline, newDiscipline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE:
				return basicSetDiscipline(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE:
				return getDiscipline();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE:
				setDiscipline((DesignDiscipline)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE:
				setDiscipline((DesignDiscipline)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DesignOfExperimentPackage.DESIGN_TYPE__DISCIPLINE:
				return discipline != null;
		}
		return super.eIsSet(featureID);
	}

} //DesignTypeImpl
