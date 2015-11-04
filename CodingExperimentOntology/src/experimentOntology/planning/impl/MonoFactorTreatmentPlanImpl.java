/**
 */
package experimentOntology.planning.impl;

import experimentOntology.planning.DualTreatmentFactor;
import experimentOntology.planning.MonoFactorTreatmentPlan;
import experimentOntology.planning.PlanningPackage;

import experimentOntology.planning.designOfExperiment.TwoTreatmentDesign;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mono Factor Treatment Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.impl.MonoFactorTreatmentPlanImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link experimentOntology.planning.impl.MonoFactorTreatmentPlanImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonoFactorTreatmentPlanImpl extends ExperimentalPlanImpl implements MonoFactorTreatmentPlan {
	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected TwoTreatmentDesign design;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected DualTreatmentFactor factor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonoFactorTreatmentPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanningPackage.Literals.MONO_FACTOR_TREATMENT_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoTreatmentDesign getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(TwoTreatmentDesign newDesign, NotificationChain msgs) {
		TwoTreatmentDesign oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(TwoTreatmentDesign newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DualTreatmentFactor getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(DualTreatmentFactor newFactor, NotificationChain msgs) {
		DualTreatmentFactor oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR, oldFactor, newFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(DualTreatmentFactor newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN:
				return basicSetDesign(null, msgs);
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR:
				return basicSetFactor(null, msgs);
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
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN:
				return getDesign();
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR:
				return getFactor();
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
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN:
				setDesign((TwoTreatmentDesign)newValue);
				return;
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR:
				setFactor((DualTreatmentFactor)newValue);
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
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN:
				setDesign((TwoTreatmentDesign)null);
				return;
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR:
				setFactor((DualTreatmentFactor)null);
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
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__DESIGN:
				return design != null;
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN__FACTOR:
				return factor != null;
		}
		return super.eIsSet(featureID);
	}

} //MonoFactorTreatmentPlanImpl
