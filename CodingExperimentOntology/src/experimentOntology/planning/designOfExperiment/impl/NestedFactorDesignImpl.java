/**
 */
package experimentOntology.planning.designOfExperiment.impl;

import experimentOntology.planning.Factor;

import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;
import experimentOntology.planning.designOfExperiment.NestedFactorDesign;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Factor Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.impl.NestedFactorDesignImpl#getStageOne <em>Stage One</em>}</li>
 *   <li>{@link experimentOntology.planning.designOfExperiment.impl.NestedFactorDesignImpl#getStageTwo <em>Stage Two</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedFactorDesignImpl extends TwoFactorDesignImpl implements NestedFactorDesign {
	/**
	 * The cached value of the '{@link #getStageOne() <em>Stage One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageOne()
	 * @generated
	 * @ordered
	 */
	protected Factor stageOne;

	/**
	 * The cached value of the '{@link #getStageTwo() <em>Stage Two</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageTwo()
	 * @generated
	 * @ordered
	 */
	protected Factor stageTwo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedFactorDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignOfExperimentPackage.Literals.NESTED_FACTOR_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getStageOne() {
		if (stageOne != null && stageOne.eIsProxy()) {
			InternalEObject oldStageOne = (InternalEObject)stageOne;
			stageOne = (Factor)eResolveProxy(oldStageOne);
			if (stageOne != oldStageOne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_ONE, oldStageOne, stageOne));
			}
		}
		return stageOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor basicGetStageOne() {
		return stageOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStageOne(Factor newStageOne) {
		Factor oldStageOne = stageOne;
		stageOne = newStageOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_ONE, oldStageOne, stageOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getStageTwo() {
		if (stageTwo != null && stageTwo.eIsProxy()) {
			InternalEObject oldStageTwo = (InternalEObject)stageTwo;
			stageTwo = (Factor)eResolveProxy(oldStageTwo);
			if (stageTwo != oldStageTwo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_TWO, oldStageTwo, stageTwo));
			}
		}
		return stageTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor basicGetStageTwo() {
		return stageTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStageTwo(Factor newStageTwo) {
		Factor oldStageTwo = stageTwo;
		stageTwo = newStageTwo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_TWO, oldStageTwo, stageTwo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_ONE:
				if (resolve) return getStageOne();
				return basicGetStageOne();
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_TWO:
				if (resolve) return getStageTwo();
				return basicGetStageTwo();
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
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_ONE:
				setStageOne((Factor)newValue);
				return;
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_TWO:
				setStageTwo((Factor)newValue);
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
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_ONE:
				setStageOne((Factor)null);
				return;
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_TWO:
				setStageTwo((Factor)null);
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
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_ONE:
				return stageOne != null;
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN__STAGE_TWO:
				return stageTwo != null;
		}
		return super.eIsSet(featureID);
	}

} //NestedFactorDesignImpl
